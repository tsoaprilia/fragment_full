package com.example.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<String> mName = new MutableLiveData<>();

    public LiveData<String> getName() {
        return mName;
    }

    public void setName(String name) {
        mName.setValue(name);
    }

    private MutableLiveData<String> mTTL = new MutableLiveData<>();
    private MutableLiveData<String> mNumber = new MutableLiveData<>();
    private MutableLiveData<String> mEmail = new MutableLiveData<>();
    private MutableLiveData<String> mAddress = new MutableLiveData<>();

    public LiveData<String> getTTL() {
        return mTTL;
    }

    public void setTTL(String age) {
        mTTL.setValue(age);
    }

    public LiveData<String> getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber.setValue(number);
    }

    public LiveData<String> getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail.setValue(email);
    }

    public LiveData<String> getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress.setValue(address);
    }
}
