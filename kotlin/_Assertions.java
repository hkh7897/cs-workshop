package kotlin;

import kotlin.jvm.JvmField;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lkotlin/_Assertions;", "", "()V", "ENABLED", "", "ENABLED$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 1, 8})
@PublishedApi
/* compiled from: AssertionsJVM.kt */
public final class _Assertions {
    @JvmField
    public static final boolean ENABLED = false;
    public static final _Assertions INSTANCE = null;

    @PublishedApi
    public static /* synthetic */ void ENABLED$annotations() {
    }

    static {
        new _Assertions();
    }

    private _Assertions() {
        INSTANCE = this;
        ENABLED = getClass().desiredAssertionStatus();
    }
}
