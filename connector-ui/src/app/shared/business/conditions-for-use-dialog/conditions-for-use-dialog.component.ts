/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Component, Inject} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {ConditionsForUseDialogData} from './conditions-for-use-dialog.data';

@Component({
  selector: 'conditions-for-use-dialog',
  templateUrl: './conditions-for-use-dialog.component.html',
})
export class ConditionsForUseDialogComponent {
  constructor(
    public dialogRef: MatDialogRef<ConditionsForUseDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: ConditionsForUseDialogData,
  ) {}
}
