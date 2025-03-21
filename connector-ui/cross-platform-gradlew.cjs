/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
const os = require('os');
const spawn = require('child_process').spawn;

let executable;
if (os.platform() === 'win32') {
  executable = `gradlew.bat`;
} else {
  executable = `./gradlew`;
}

let args = process.argv.slice(2);
console.log(`CWD: ${process.cwd()}`);
console.log(`Running: ${executable} ${args.join(' ')}`);
const run = spawn(executable, args, {stdio: 'inherit'});

run.on('close', (code) => {
  process.exit(code);
});
