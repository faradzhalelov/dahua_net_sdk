package com.dahua.sdk.dahua_sdk;

import android.content.Context;

import androidx.annotation.NonNull;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

import java.util.Map;

/**
 * DahuaPreviewFactory - Factory class for creating DahuaPreviewView instances
 * This is used by Flutter to create native views for video preview
 */
public class DahuaPreviewFactory extends PlatformViewFactory {
    private final BinaryMessenger messenger;
    private final Context context;

    public DahuaPreviewFactory(BinaryMessenger messenger, Context context) {
        super(StandardMessageCodec.INSTANCE);
        this.messenger = messenger;
        this.context = context;
    }

    @NonNull
    @Override
    public PlatformView create(Context context, int viewId, Object args) {
        @SuppressWarnings("unchecked")
        Map<String, Object> creationParams = (args instanceof Map) ? (Map<String, Object>) args : null;
        return new DahuaPreviewView(this.context, viewId, creationParams, messenger);
    }
}
