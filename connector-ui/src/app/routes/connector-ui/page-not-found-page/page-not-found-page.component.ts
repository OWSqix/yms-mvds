/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Component, HostBinding} from '@angular/core';

@Component({
  selector: 'app-page-not-found-page',
  templateUrl: './page-not-found-page.component.html',
})
export class PageNotFoundPageComponent {
  @HostBinding('class.container')
  @HostBinding('class.flex')
  @HostBinding('class.items-center')
  @HostBinding('class.min-h-screen')
  @HostBinding('class.px-6')
  @HostBinding('class.py-12')
  @HostBinding('class.box-border')
  cls = true;
}
