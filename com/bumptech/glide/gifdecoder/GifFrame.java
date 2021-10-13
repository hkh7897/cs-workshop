package com.bumptech.glide.gifdecoder;

import androidx.annotation.ColorInt;

/* access modifiers changed from: package-private */
public class GifFrame {
    static final int DISPOSAL_BACKGROUND = 2;
    static final int DISPOSAL_NONE = 1;
    static final int DISPOSAL_PREVIOUS = 3;
    static final int DISPOSAL_UNSPECIFIED = 0;
    int bufferFrameStart;
    int delay;
    int dispose;
    int ih;
    boolean interlace;
    int iw;
    int ix;
    int iy;
    @ColorInt
    int[] lct;
    int transIndex;
    boolean transparency;

    GifFrame() {
    }
}
