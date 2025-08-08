/*
 * Copyright 2022 Eclipse Foundation and Contributors
 * Copyright 2025 sovity GmbH
 * Copyright 2024 Fraunhofer Institute for Applied Information Technology FIT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     Eclipse Foundation - initial setup of the eclipse-edc/DataDashboard UI
 *     sovity - continued development
 *     Fraunhofer FIT - contributed initial internationalization support
 */
import {BreakpointObserver} from '@angular/cdk/layout';
import {Component, Inject, OnInit, ViewChild} from '@angular/core';
import {MatSidenav} from '@angular/material/sidenav';
import {Title} from '@angular/platform-browser';
import {Router, NavigationEnd} from '@angular/router';
import {Observable} from 'rxjs';
import {map, shareReplay, filter} from 'rxjs/operators';
import {TranslateService} from '@ngx-translate/core';
import {NavItemGroup} from 'src/app/core/services/models/nav-item-group';
import {NavItemsBuilder} from 'src/app/core/services/nav-items-builder';
import {isLanguageSupported} from 'src/app/core/utils/i18n-utils';
import {LocalStoredValue} from 'src/app/core/utils/local-stored-value';
import {APP_CONFIG, AppConfig} from '../../core/config/app-config';
import {LoginPollingService} from '../../core/services/login-polling.service';

@Component({
  selector: 'connector-ui-page-layout',
  templateUrl: './connector-ui.component.html',
  styleUrls: ['./connector-ui.component.scss'],
})
export class ConnectorUiComponent implements OnInit {
  @ViewChild('drawer') drawer!: MatSidenav;
  
  // SCSS와 동일 기준으로 통일: max-width: 767px
  isHandset$: Observable<boolean> = this.breakpointObserver
    .observe(['(max-width: 767px)'])
    .pipe(
      map((result) => result.matches),
      shareReplay(),
    );

  navItemGroups: NavItemGroup[] = [];
  currentPath: string = '';

  selectedLanguage = new LocalStoredValue<string>(
    'ko',
    'selectedLanguage',
    isLanguageSupported,
  );

  constructor(
    @Inject(APP_CONFIG) public config: AppConfig,
    public titleService: Title,
    private breakpointObserver: BreakpointObserver,
    private loginPollingService: LoginPollingService,
    private navItemsBuilder: NavItemsBuilder,
    private translateService: TranslateService,
    private router: Router,
  ) {
    this.navItemGroups = this.navItemsBuilder.buildNavItemGroups();
    this.translateService.setDefaultLang('ko');
    this.translateService.use(this.selectedLanguage.value);
    
    // 현재 경로 추적
    this.router.events.pipe(
      filter((event): event is NavigationEnd => event instanceof NavigationEnd)
    ).subscribe((event) => {
      this.currentPath = event.urlAfterRedirects.split('/').pop() || '';
    });
  }

  ngOnInit() {
    this.startLoginPolling();
  }

  private startLoginPolling() {
    this.loginPollingService.startPolling();
  }

  // 모바일에서 현재 페이지 타이틀을 가져오는 메소드
  getCurrentPageTitle(): string {
    // 모든 네비게이션 아이템에서 현재 경로와 일치하는 것을 찾기
    for (const group of this.navItemGroups) {
      for (const item of group.items) {
        if (item.path === this.currentPath) {
          return item.title;
        }
      }
    }
    
    // 기본값으로 대시보드 반환
    return 'dashboard_page.title';
  }

  // 모바일에서 현재 페이지 아이콘을 가져오는 메소드
  getCurrentPageIcon(): string {
    // 모든 네비게이션 아이템에서 현재 경로와 일치하는 것을 찾기
    for (const group of this.navItemGroups) {
      for (const item of group.items) {
        if (item.path === this.currentPath) {
          return item.icon;
        }
      }
    }
    
    // 기본값으로 대시보드 아이콘 반환
    return 'data_usage';
  }
}
