/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {MailtoLinkBuilder} from './mailto-link-builder';

describe('mailto-link-builder', () => {
  const builder = new MailtoLinkBuilder();

  it('build link with all fields', () => {
    expect(
      builder.buildMailtoUrl(
        'test@test.com',
        'subject abc',
        'body',
        'cc',
        'bcc',
      ),
    ).toEqual(
      'mailto:test@test.com?subject=subject%20abc&body=body&cc=cc&bcc=bcc',
    );
  });
  it('build link with only email', () => {
    expect(builder.buildMailtoUrl('test@test.com')).toEqual(
      'mailto:test@test.com',
    );
  });
});
