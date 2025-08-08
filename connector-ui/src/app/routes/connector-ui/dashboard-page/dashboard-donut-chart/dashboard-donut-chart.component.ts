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
import {DonutChartData} from './donut-chart-data';

@Component({
  selector: 'dashboard-donut-chart',
  templateUrl: './dashboard-donut-chart.component.html',
})
export class DashboardDonutChartComponent {
  @HostBinding('class.flex')
  @HostBinding('class.flex-col')
  @HostBinding('class.justify-center')
  @HostBinding('class.items-center')
  @HostBinding('class.items-center')
  @HostBinding('class.min-h-[300px]')
  cls = true;

  @Input()
  data = Fetched.empty<DonutChartData>();

  // Use 'pie' chart type but cast to 'doughnut' for type compatibility
  chartType: any = 'pie';
}
