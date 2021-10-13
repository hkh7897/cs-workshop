package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.work.WorkRequest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public final class PeriodicWorkRequest extends WorkRequest {
    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;
    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    PeriodicWorkRequest(Builder builder) {
        super(builder.mId, builder.mWorkSpec, builder.mTags);
    }

    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        /* access modifiers changed from: package-private */
        @Override // androidx.work.WorkRequest.Builder
        @NonNull
        public Builder getThis() {
            return this;
        }

        public Builder(@NonNull Class<? extends ListenableWorker> cls, long j, @NonNull TimeUnit timeUnit) {
            super(cls);
            this.mWorkSpec.setPeriodic(timeUnit.toMillis(j));
        }

        @RequiresApi(26)
        public Builder(@NonNull Class<? extends ListenableWorker> cls, @NonNull Duration duration) {
            super(cls);
            this.mWorkSpec.setPeriodic(duration.toMillis());
        }

        public Builder(@NonNull Class<? extends ListenableWorker> cls, long j, @NonNull TimeUnit timeUnit, long j2, @NonNull TimeUnit timeUnit2) {
            super(cls);
            this.mWorkSpec.setPeriodic(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        @RequiresApi(26)
        public Builder(@NonNull Class<? extends ListenableWorker> cls, @NonNull Duration duration, @NonNull Duration duration2) {
            super(cls);
            this.mWorkSpec.setPeriodic(duration.toMillis(), duration2.toMillis());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.WorkRequest.Builder
        @NonNull
        public PeriodicWorkRequest buildInternal() {
            if (!this.mBackoffCriteriaSet || Build.VERSION.SDK_INT < 23 || !this.mWorkSpec.constraints.requiresDeviceIdle()) {
                return new PeriodicWorkRequest(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }
}
