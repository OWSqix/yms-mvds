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
  prefix: '',
  content: ['./src/**/*.{html,ts}'],
  darkMode: 'class', // or 'media' or 'class'
  theme: {
    screens: {
      'xs': '375px',   // 모바일 소형
      'sm': '640px',   // 모바일 대형
      'md': '768px',   // 태블릿
      'lg': '1024px',  // 데스크톱
      'xl': '1280px',  // 데스크톱 대형
      '2xl': '1536px', // 와이드스크린
      '3xl': '1920px', // 초대형 스크린
    },
    container: {
      center: true,
      padding: {
        DEFAULT: '1rem',
        'sm': '1.5rem',
        'lg': '2rem',
      },
      screens: {
        'sm': '640px',
        'md': '768px', 
        'lg': '1024px',
        'xl': '1280px',
        '2xl': '87.5rem',
        '3xl': '100rem',
      },
    },
    extend: {
      spacing: {
        '18': '4.5rem',
        '88': '22rem',
      },
      minHeight: {
        '0': '0',
        '1/4': '25%',
        '1/2': '50%',
        '3/4': '75%',
        'full': '100%',
        'screen': '100vh',
      },
    },
  },
  variants: {
    extend: {},
  },
  plugins: [require('@tailwindcss/typography')],
};
