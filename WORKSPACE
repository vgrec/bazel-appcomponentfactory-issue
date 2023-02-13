load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "build_bazel_rules_android",
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    strip_prefix = "rules_android-0.1.1",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"],
)

# Configure Android SDK Path
load("@build_bazel_rules_android//android:rules.bzl", "android_sdk_repository")

android_sdk_repository(
    name = "androidsdk",
    build_tools_version = "30.0.2", # go to android/sdk/build-tools and put here one of the available options
    path = "/Users/veaceslavg/Library/Android/sdk",  # Path to Android SDK, optional if $ANDROID_HOME is set
)
