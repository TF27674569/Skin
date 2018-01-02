package com.skin;

import android.os.Bundle;

import org.skin.BaseSkinActivity;
import org.skin.SkinManager;
import org.skin.SkinResource;

public class MainActivity extends BaseSkinActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化
        SkinManager.getInstance().init(this);

        // 需要保证所用颜色值的名称一致  color_main  皮肤包对应的颜色和 应用对应的一致
        SkinManager.getInstance().skin("皮肤包路径");

        // 重置默认
        SkinManager.getInstance().reStoreDefault();
    }

    @Override
    public void changeSkin(SkinResource skinResource) {
        super.changeSkin(skinResource);
        // 存在自定义View时，自定义View回调此函数
    }
}
