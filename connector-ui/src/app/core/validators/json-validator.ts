/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {AbstractControl, ValidationErrors, ValidatorFn} from '@angular/forms';

/**
 * Validates whether control's value is valid JSON.
 * @param control control
 */
export const jsonValidator: ValidatorFn = (
  control: AbstractControl,
): ValidationErrors | null => {
  const value = control.value;
  if (value) {
    try {
      JSON.parse(value);
    } catch (e) {
      return {jsonInvalid: true};
    }
  }
  return null;
};
