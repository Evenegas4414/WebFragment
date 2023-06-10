package com.ervr.webfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

public class WebFragment extends Fragment {

    private WebView webView;

    public WebFragment() {
        // Constructor vacío requerido por Android
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_web, container, false);

        webView = rootView.findViewById(R.id.webView);

        return rootView;
    }

    public void loadUrl(String url) {
        webView.loadUrl(url);
    }
}
