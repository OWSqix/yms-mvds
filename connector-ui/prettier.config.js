/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
module.exports = {
  tabWidth: 2,
  useTabs: false,
  singleQuote: true,
  semi: true,
  arrowParens: 'always',
  trailingComma: 'all',
  bracketSameLine: true,
  printWidth: 80,
  bracketSpacing: false,
  proseWrap: 'always',

  attributeGroups: [
    '$ANGULAR_STRUCTURAL_DIRECTIVE',
    '^(id|name)$',
    '^class$',
    '$DEFAULT',
    '^aria-',
    '$ANGULAR_INPUT',
    '$ANGULAR_TWO_WAY_BINDING',
    '$ANGULAR_OUTPUT',
  ],

  // @trivago/prettier-plugin-sort-imports
  importOrder: [
    // this import needs to be on top or tests fail
    '^zone.js/testing$',
    // third parties first
    '^@angular/(.*)$',
    '^rxjs(/(.*))?$',
    '<THIRD_PARTY_MODULES>',
    // rest after
    '^[./]',
  ],
  importOrderParserPlugins: [
    'typescript',
    'classProperties',
    'decorators-legacy',
  ],
  importOrderSeparation: false,
  importOrderSortSpecifiers: true,
};
