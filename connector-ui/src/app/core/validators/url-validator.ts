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

export const validUrlPattern = /^(http|https):\/\/[^ "]+$/;

/**
 * Validates whether control's value is a valid URL.
 * @param control control
 */
export const urlValidator: ValidatorFn = (
  control: AbstractControl,
): ValidationErrors | null => {
  const value: string = control.value;

  if (!value?.length || validUrlPattern.test(value)) {
    return null;
  }

  return {url: true};
};
