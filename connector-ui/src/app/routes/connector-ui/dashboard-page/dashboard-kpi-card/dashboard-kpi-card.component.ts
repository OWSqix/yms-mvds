/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Component, HostBinding, Input} from '@angular/core';
import {Fetched} from '../../../../core/services/models/fetched';

@Component({
  selector: 'dashboard-kpi-card',
  styles: [
    `
      :host {
        min-width: 200px;
        height: 180px;
      }
    `,
  ],
  templateUrl: './dashboard-kpi-card.component.html',
})
export class DashboardKpiCardComponent {
  @HostBinding('class.flex')
  cls = true;

  @Input()
  kpi = Fetched.empty<number>();

  @Input()
  label = 'Label';

  fontSize(data: number): number {
    const abs = Math.abs(data);
    if (abs < 100) {
      return 81;
    } else if (abs < 1000) {
      return 72;
    } else if (abs < 10000) {
      return 64;
    } else {
      return 56;
    }
  }
}
