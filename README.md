#Gradle基础支持组件库

###desc:
Gradle的统一依赖，所有项目的支持组件版本统一化组件

###使用方法:

STEP1:
---
工程目录`build.gradle`配置如下

```
buildscript {
    repositories {
        jcenter()
        maven { url 'http://120.55.52.80:8081/repository/maven-releases' }
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.3.3'
        classpath 'com.cardioval.architecture:gradle-config:1.0.4'
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
        maven { url 'http://120.55.52.80:8081/repository/maven-releases' }
    }
}
```


STEP2:
---
在需要进行依赖的子`module`的`build.gradle`中，顶部添加如下字段

```
apply plugin: 'com.cardioval.gradleconfig'
```

STEP3:
---
添加依赖示例
```
compileSdkVersion cardioConfig.compileSdkVersion
minSdkVersion cardioConfig.minSdkVersion


compile cardioConfig.libKLog
```


PS:
---
详细配置信息如下
```
// ========================== Compile ==========================
public int compileSdkVersion = 26;
public int minSdkVersion = 19;
public int targetSdkVersion = 26;

public String buildToolsVersion = "26.0.2";
// ========================== Compile ==========================

// ========================== Dependency ==========================

private static final String SUPPORT_VERSION = "25.3.1";
// https://developer.android.com/topic/libraries/support-library/revisions.html
public String libSupportDesign = "com.android.support:design:" + SUPPORT_VERSION;
public String libSupportV4 = "com.android.support:support-v4:" + SUPPORT_VERSION;
public String libAppcompatV7 = "com.android.support:appcompat-v7:" + SUPPORT_VERSION;
public String libRecyclerViewV7 = "com.android.support:recyclerview-v7:" + SUPPORT_VERSION;
public String libCardViewV7 = "com.android.support:cardview-v7:" + SUPPORT_VERSION;

private String RETROFIT_VERSION = "2.3.0";
// https://github.com/square/retrofit
public String libRetrofit = "com.squareup.retrofit2:retrofit:" + RETROFIT_VERSION;
public String libRetrofitAdapterRxJava = "com.squareup.retrofit2:adapter-rxjava2:" + RETROFIT_VERSION;
public String libRetrofitConverterGson = "com.squareup.retrofit2:converter-gson:" + RETROFIT_VERSION;
public String libRetrofitConverterScalars = "com.squareup.retrofit2:converter-scalars:" + RETROFIT_VERSION;
public String libRetrofitConverterSimpleXml = "com.squareup.retrofit2:converter-simplexml:" + RETROFIT_VERSION;

private String OKHTTP_VERISON = "3.6.0";
// https://github.com/square/okhttp
public String libOkHttp = "com.squareup.okhttp3:okhttp:" + OKHTTP_VERISON;
public String libOkHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:" + OKHTTP_VERISON;

private String OKIO_VERISON = "1.13.0";
// https://github.com/square/okio
public String libOkio = "com.squareup.okio:okio:" + OKIO_VERISON;

// https://github.com/ReactiveX/RxJava
public String libRxJava = "io.reactivex:rxjava:1.2.6";
public String libRxJava2 = "io.reactivex.rxjava2:rxjava:2.1.1";

// https://github.com/ReactiveX/RxAndroid
public String libRxAndroid = "io.reactivex:rxandroid:1.2.1";
public String libRxAndroid2 = "io.reactivex.rxjava2:rxandroid:2.0.1";

// https://github.com/greenrobot/EventBus
public String libEventBus = "org.greenrobot:eventbus:3.0.0";

// https://github.com/bumptech/glide
private String GLIDE_VERSION = "4.3.1"
public String libGlide = "com.github.bumptech.glide:glide:" + GLIDE_VERSION;
public String annoGlide = "com.github.bumptech.glide:compiler:" + GLIDE_VERSION;

private String BUTTERKNIFE_VERSION = "8.8.1"
// https://github.com/JakeWharton/butterknife
public String libButterKnife = "com.jakewharton:butterknife:${BUTTERKNIFE_VERSION}";
public String annoButterKnife = "com.jakewharton:butterknife-compiler:${BUTTERKNIFE_VERSION}";

// https://github.com/greenrobot/greenDAO
public String libGreenDao = "org.greenrobot:greendao:3.2.0";

// https://github.com/google/gson
public String libGson = "com.google.code.gson:gson:2.8.0";

// https://github.com/lzyzsd/JsBridge
public String libJsBridge = "com.github.lzyzsd:jsbridge:1.0.4";

// https://github.com/alibaba/ARouter
public String libArouter = "com.alibaba:arouter-api:1.2.1";
public String annoArouter = "com.alibaba:arouter-compiler:1.1.2";

// https://github.com/ZhaoKaiQiang/KLog
public String libKLog = "com.github.zhaokaiqiang.klog:library:1.6.0";

// https://github.com/H07000223/FlycoSystemBar
public String libFlycoSystemBar = "com.flyco.systembar:FlycoSystemBar_Lib:1.0.0@aar";

// https://github.com/H07000223/FlycoRoundView
public String libFlycoRoundView = "com.flyco.roundview:FlycoRoundView_Lib:1.1.4@aar";

// https://github.com/romandanylyk/PageIndicatorView
public String libPageIndicator = "com.romandanylyk:pageindicatorview:0.1.2";

// https://github.com/balysv/material-ripple
public String libMaterialRipple = "com.balysv:material-ripple:1.0.2";

private String ZXING_VERISON = "3.3.0";
// https://github.com/zxing/zxing
public String libZxing = "com.google.zxing:core:" + ZXING_VERISON;

// https://bugly.qq.com/v2/index
public String libBugly = "com.tencent.bugly:crashreport:2.6.0";
public String libBuglyNative = "com.tencent.bugly:nativecrashreport:3.2.0";

private String LEAK_CANARY_VERISON = "1.5";
// https://github.com/square/leakcanary
public String leakCanaryDebug = "com.squareup.leakcanary:leakcanary-android:" + LEAK_CANARY_VERISON;
public String leakCanaryRelease = "com.squareup.leakcanary:leakcanary-android-no-op:" + LEAK_CANARY_VERISON;

private String ULTIMATE_BAR_VERSION = "1.0.3";
// https://github.com/Zackratos/UltimateBar
public String libUltimateBar = "org.zackratos:ultimatebar:" + ULTIMATE_BAR_VERSION;

private String BOTTOM_NAVIGATION_BAR_VERSION = "2.0.1";
// https://github.com/Ashok-Varma/BottomNavigation
public String libBottomNavigationBar = "com.ashokvarma.android:bottom-navigation-bar:" + BOTTOM_NAVIGATION_BAR_VERSION;

private String BANNER_VERSION = "1.4.10";
// https://github.com/youth5201314/banner
public String libBanner = "com.youth.banner:banner:" + BANNER_VERSION;

// ========================== Dependency ==========================

// ========================== Cardioval Dependency Prefix ==========================
public String baseComponentPrefix = "com.cardioval.architecture:base-component:";
public String httpComponentPrefix = "com.cardioval.architecture:lib-http-component:";
public String uiFrameworkComponentPrefix = "com.cardioval.architecture:lib-ui-framework-component:";
public String uiKitComponentPrefix = "com.cardioval.architecture:lib-ui-kit-component:";


public String qmuiBaseComponentPrefix = "com.cardioval.qmui:lib-qmui-base-component:";

// ========================== Cardioval Dependency Prefix ==========================
```