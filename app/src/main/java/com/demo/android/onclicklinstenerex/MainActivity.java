package com.demo.android.onclicklinstenerex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找出 Button 與 ImageView 的UI元件，試寫出來
        Button btnDisplay=(Button)findViewById(R.id.button1);
        Button btnHide=(Button)findViewById(R.id.button2);
        Button btnRoomIn=(Button)findViewById(R.id.button3);
        Button btnRoomOut=(Button)findViewById(R.id.button4);
        btnDisplay.setOnClickListener(displayImg);
        btnHide.setOnClickListener(hideImg);
        btnRoomIn.setOnClickListener(roomIn);
        btnRoomOut.setOnClickListener(roomOut);
        imageView=(ImageView)findViewById(R.id.imageView1);
    }
    int h,w;
    ImageView imageView;
    //建立負責顯示圖片的監聽器
    View.OnClickListener displayImg = new View.OnClickListener() {
        public void onClick(View v){
            //將此行程式放入到 displayImg 監聽器的事件處理方法裡
            imageView.setVisibility(View.VISIBLE);
        }
    };
    //建立負責隱藏圖片的監聽器
    private View.OnClickListener hideImg=new View.OnClickListener(){
            @Override
            public void onClick(View v){
               // ImageView imageView=(ImageView)findViewById(R.id.imageView1);
                //將此行程式放入到 hideImg 監聽器的事件處理方法裡
                imageView.setVisibility(View.INVISIBLE);
            }
    };
    //建立負責放大圖片的監聽器
    private View.OnClickListener roomIn=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //將此段程式放入到 roomIn 監聽器的事件處理方法裡
			h = imageView.getHeight();
			w = imageView.getWidth();
			imageView.setLayoutParams(new LinearLayout.LayoutParams(h+=10, w+=10));
            }
    };
    //建立負責縮小圖片的監聽器
    private View.OnClickListener roomOut=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //將此段程式放入到 roomOut 監聽器的事件處理方法裡
			h = imageView.getHeight();
			w = imageView.getWidth();
			if(h> 10 & w > 10)
			imageView.setLayoutParams(new LinearLayout.LayoutParams(h-=10, w-=10));
        }
    };
}
