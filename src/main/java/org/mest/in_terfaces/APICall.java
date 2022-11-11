package org.mest.in_terfaces;

public class APICall implements APIInterface<String> {


    @Override
    public String didReceiveResult() {
        return "";
    }

    @Override
    public void didCancel() {

    }

    @Override
    public void didFailed(String reason) {

    }

    public void main() {
         callAPI(this);
    }


    private void callAPI(APIInterface apiInterface){

    }
}
