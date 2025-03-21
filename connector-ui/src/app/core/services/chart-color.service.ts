/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Injectable} from '@angular/core';

@Injectable({providedIn: 'root'})
export class ChartColorService {
  private chartColors = [
    '#fd7f6f',
    '#7eb0d5',
    '#b2e061',
    '#bd7ebe',
    '#ffb55a',
    '#ffee65',
    '#beb9db',
    '#fdcce5',
    '#8bd3c7',
  ];

  /**
   * To make charts look different but recognizable, we take colors at different offsets, but rotate the colors in
   * the same direction on the palette. If necessary we wrap around
   * @param amount
   */
  getColors(amount: number, offset: number): string[] {
    return Array.from({length: amount}, (_, i) => this.colorAt(i + offset));
  }

  colorAt(index: number): string {
    return this.chartColors[index % this.chartColors.length];
  }
}
