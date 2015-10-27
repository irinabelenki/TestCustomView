package testcustomview.example.com.testcustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Irina on 10/27/2015.
 */
public class SquareView extends View {
    private Paint paint;

    public SquareView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int w = getWidth();
        int h = getHeight();
        canvas.drawLine(0, 0, w, h, paint);
        canvas.drawLine(w, 0, 0, h, paint);
    }
}
