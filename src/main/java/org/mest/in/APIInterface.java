package org.mest.in;

public interface APIInterface<T> {

    void didCancel();

    void didFailed(String reason);

    T didReceiveResult();
}
