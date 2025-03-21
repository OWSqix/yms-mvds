/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {CommonModule} from '@angular/common';
import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {LogoutPageComponent} from './logout-page.component';

@NgModule({
  imports: [
    // Angular
    CommonModule,
    RouterModule,
  ],
  declarations: [LogoutPageComponent],
  exports: [LogoutPageComponent],
})
export class LogoutPageModule {}
