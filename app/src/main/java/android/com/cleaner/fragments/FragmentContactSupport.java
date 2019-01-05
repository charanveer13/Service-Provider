package android.com.cleaner.fragments;

import android.com.cleaner.R;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import am.appwise.components.ni.NoInternetDialog;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class FragmentContactSupport extends Fragment {


    private View view;
    private ImageView backarr;

    private NoInternetDialog noInternetDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_contact_support, container, false);

        noInternetDialog = new NoInternetDialog.Builder(getContext()).build();

        findingIdsHere(view);


        return view;
    }

    private void findingIdsHere(View view) {
        backarr = view.findViewById(R.id.backarr);

        backarr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        noInternetDialog.onDestroy();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(CalligraphyContextWrapper.wrap(context));

    }
}
