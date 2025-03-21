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

@Component({
  selector: 'horizontal-section-divider',
  templateUrl: './horizontal-section-divider.component.html',
})
export class HorizontalSectionDividerComponent {
  @HostBinding('class.flex')
  @HostBinding('class.items-center')
  cls = true;

  @Input()
  text: string = '';
}
