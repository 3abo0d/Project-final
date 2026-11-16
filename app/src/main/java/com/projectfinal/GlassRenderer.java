package com.projectfinal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.view.View;

public class GlassRenderer {

    private static final Paint paint = new Paint(
        Paint.ANTI_ALIAS_FLAG
    );

    public static void apply(View view) {
        if (view == null) return;

        view.setBackground(null);

        view.setRenderEffect(
            RenderEffect.createBlurEffect(
                2f,
                2f,
                Shader.TileMode.CLAMP
            )
        );
    }

    public static void drawGlass(
        Canvas canvas,
        RectF bounds,
        float radius
    ) {
        paint.setColor(Color.argb(35, 255, 255, 255));
        paint.setStyle(Paint.Style.FILL);

        canvas.drawRoundRect(
            bounds,
            radius,
            radius,
            paint
        );

        paint.setColor(Color.argb(90, 255, 255, 255));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.5f);

        canvas.drawRoundRect(
            bounds,
            radius,
            radius,
            paint
        );
    }
}
