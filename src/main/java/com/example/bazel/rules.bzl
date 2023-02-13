"""Git version generation"""

def _impl(ctx):
    print("INFO FILE")
    print(ctx.info_file.path)

test_rule = rule(
    implementation = _impl,
)
