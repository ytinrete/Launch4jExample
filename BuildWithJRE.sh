#!/usr/bin/env bash
echo 'you must install gradle first'
gradle launch4j
unzip -o -d ./build/launch4j/ ./jre.zip
cd build/launch4j
mkdir target

mv Launch4jExample.exe target/Launch4jExample.exe
mv jre target/jre
mv lib target/lib

zip -r target.zip target

rm -rf target