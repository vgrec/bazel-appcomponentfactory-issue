load(":rules.bzl", "test_rule")

package(
    default_visibility = ["//src:__subpackages__"],
)

android_library(
    name = "greeter_activity",
    srcs = [
        "Greeter.java",
        "MainActivity.java",
        "MainAppComponentFactory.java",
    ],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
)

test_rule(
    name = "test",
)
