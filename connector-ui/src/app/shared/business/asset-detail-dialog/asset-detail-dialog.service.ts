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
import {MatDialog} from '@angular/material/dialog';
import {NEVER, Observable} from 'rxjs';
import {showDialogUntil} from '../../../core/utils/mat-dialog-utils';
import {AssetDetailDialogData} from './asset-detail-dialog-data';
import {AssetDetailDialogResult} from './asset-detail-dialog-result';
import {AssetDetailDialogComponent} from './asset-detail-dialog.component';

@Injectable()
export class AssetDetailDialogService {
  constructor(private dialog: MatDialog) {}

  /**
   * Shows an Asset Detail Dialog until until$ emits / completes
   * @param data Asset Detail Dialog data, or a stream if there's a need to refresh the data
   * @param until$ observable that controls the lifetime of the dialog
   */
  open(
    data: AssetDetailDialogData | Observable<AssetDetailDialogData>,
    until$: Observable<any> = NEVER,
  ): Observable<AssetDetailDialogResult | undefined> {
    return showDialogUntil(
      this.dialog,
      AssetDetailDialogComponent,
      {data, maxWidth: '1000px', maxHeight: '90vh', autoFocus: false},
      until$,
    );
  }
}
