package dduw.com.mobile.retry

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
//import androidx.compose.ui.graphics.Paint

class MyCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    var m_x = 200.toFloat()
    var m_y = 200.toFloat()
    var color_name = Color.GREEN
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.LTGRAY)
        val paint = Paint()
        paint.color = color_name
        canvas.drawCircle(m_x, m_y, 100.toFloat(), paint)

    }
}
