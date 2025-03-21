/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {FormControl, ɵFormGroupValue} from '@angular/forms';

/**
 * Form Model for ContractAgreementTransferDialog > Datasink > HTTP/REST > Header
 */
export interface HttpDatasinkHeaderFormModel {
  headerName: FormControl<string>;
  headerValue: FormControl<string>;
}

/**
 * Form Value for ContractAgreementTransferDialog > Datasink > HTTP/REST > Header
 */
export type HttpDatasinkHeaderFormValue =
  ɵFormGroupValue<HttpDatasinkHeaderFormModel>;
