package org.mest.in_heritance;

public interface APIInterface<T> {

    void didCancel();

    void didFailed(String reason);

    T didReceiveResult();
}
