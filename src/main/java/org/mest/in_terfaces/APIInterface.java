package org.mest.in_terfaces;

public interface APIInterface<T> {

    void didCancel();

    void didFailed(String reason);

    T didReceiveResult();
}
