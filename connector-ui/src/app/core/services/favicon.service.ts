/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {DOCUMENT} from '@angular/common';
import {Inject, Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class FaviconService {
  constructor(@Inject(DOCUMENT) private document: Document) {}

  setFavicon(src: string) {
    const link = this.findOrCreateLink('icon');
    link.setAttribute('href', src);
  }

  private findOrCreateLink(rel: string): HTMLLinkElement {
    let link = document.querySelector(`link[rel~='${rel}']`) as HTMLLinkElement;
    if (!link) {
      link = this.document.createElement('link');
      link.setAttribute('rel', rel);

      const head = this.document.querySelector('head') as HTMLHeadElement;
      head.appendChild(link);
    }
    return link;
  }
}
