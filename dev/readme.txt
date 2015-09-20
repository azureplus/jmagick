----------------------------------------------------------------------
Libraries have been installed in:
   /app/ImageMagick6/lib
准备条件
安装ImageMagic，配置./configure --prefix=/app/ImageMagick6


1、./configure --prefix=/app/jmagick --with-magick-home=/app/ImageMagick6  --with-magick-lib-dir=/app/ImageMagick6/lib --with-magick-inc-dir=/app/ImageMagick6/include/ImageMagick-6  --enable-diagnostic
a.出现以下的问题
Package MagickCore was not found in the pkg-config search path.
Perhaps you should add the directory containing `MagickCore.pc'
to the PKG_CONFIG_PATH environment variable
No package 'MagickCore' found
Package MagickCore was not found in the pkg-config search path.
Perhaps you should add the directory containing `MagickCore.pc'
to the PKG_CONFIG_PATH environment variable
No package 'MagickCore' found
Package MagickCore was not found in the pkg-config search path.
Perhaps you should add the directory containing `MagickCore.pc'
to the PKG_CONFIG_PATH environment variable
No package 'MagickCore' found
解决方法
(1)、pkg-config是向configure程序提供系统信息的程序，比如软件的版本，库的版本，库的路径等等
建立软链接：sudo ln -s /app/ImageMagick6/lib/pkgconfig/* /usr/lib/pkgconfig/
重新.回到执行 [1]
2、make && make install

ldd .so可以看到该库链接的库是否正常
