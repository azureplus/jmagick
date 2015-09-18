#!/usr/bin/env bash
./configure --prefix=/app/ImageMagick6 CPPFLAGS=-I/app/ImageMagick6  LIBS="-lMagickCore" --enable-shared=yes --enable-static=yes --with-quantum-depth=16
