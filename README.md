## Description
This is a POC project showcasing the `ClassNotFoundException` when using a custom `AppComponentFactory` in a Bazel project with `mobile-install`  

To run the project you need to update/comment-out the `android_sdk_repository(path = '..')` from the `WORKSPACE` file.

#### Steps to reproduce
1. Build the app with: `bazel mobile-install //src/main:app`
2. Open the app
3. Check the error logs

Logs:
```
java.lang.ClassNotFoundException: Didn't find class "com.example.bazel.MainAppComponentFactory" on path: DexPathList[[zip file "/data/app/~~4OHgelH7C25AIUt3-0fsWA==/com.example.bazel-Hwab-Fhy4ZtyrRAQZxq4vA==/base.apk"],nativeLibraryDirectories=[/data/app/~~4OHgelH7C25AIUt3-0fsWA==/com.example.bazel-Hwab-Fhy4ZtyrRAQZxq4vA==/lib/arm64, /system/lib64, /system/system_ext/lib64]]
        at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:259)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
        at android.app.LoadedApk.createAppFactory(LoadedApk.java:285)
        at android.app.LoadedApk.createOrUpdateClassLoaderLocked(LoadedApk.java:1017)
        at android.app.LoadedApk.getClassLoader(LoadedApk.java:1104)
        at android.app.LoadedApk.getResources(LoadedApk.java:1398)
        at android.app.ContextImpl.createAppContext(ContextImpl.java:3158)
        at android.app.ContextImpl.createAppContext(ContextImpl.java:3150)
        at android.app.ActivityThread.handleBindApplication(ActivityThread.java:7389)
        at android.app.ActivityThread.access$1700(ActivityThread.java:310)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2281)
        at android.os.Handler.dispatchMessage(Handler.java:106)
        at android.os.Looper.loopOnce(Looper.java:226)
        at android.os.Looper.loop(Looper.java:313)
        at android.app.ActivityThread.main(ActivityThread.java:8669)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:571)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1135)
```

#### Note
This issue is not reproducible when building with `bazel build`