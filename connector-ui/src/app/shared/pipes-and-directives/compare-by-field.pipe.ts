/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Pipe, PipeTransform} from '@angular/core';

/**
 * Creates Compare By Function for Angular Material compareWith parameters
 */
@Pipe({name: 'compareByField'})
export class CompareByFieldPipe implements PipeTransform {
  transform(key: string): (a: any, b: any) => boolean {
    return (a, b) => a === b || (a != null && b != null && a[key] === b[key]);
  }
}
