package dario.mahalambe.recyclerviewlogcalls.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import dario.mahalambe.recyclerviewlogcalls.R;
import dario.mahalambe.recyclerviewlogcalls.model.Call;

/**
 * Created by Dario Mahalambe on 04/01/2018.
 */

public class CallLogAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int USER_TYPE = 1;

    private static final int HEADER_TYPE = 2;

    private List<Call> mList = new ArrayList<>();


    public CallLogAdapter(List<Call> mList) {

        this.mList = mList;

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        switch (viewType) {
            case USER_TYPE:

                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_calls, parent, false);
                return new CallLogViewHolder(view);

            case HEADER_TYPE:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_section_header, parent, false);
                return new SectionHeaderViewHolder(view);

            default:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_calls, parent, false);

                return new CallLogViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Call call = mList.get(position);

        int itemViewType = getItemViewType(position);

        if (itemViewType == USER_TYPE) {

            ((CallLogViewHolder) holder).mTextViewName.setText(call.getName());

            ((CallLogViewHolder) holder).mTextViewTime.setText(call.getTimeOfCall());

            ((CallLogViewHolder) holder).mTextViewMobileCommunication.setText(call.getMobileCommunication());

            ((CallLogViewHolder) holder).mImageViewLetter.setImageResource(call.getLetterImage());

        } else {
            ((SectionHeaderViewHolder) holder).mTextViewSectionTitle.setText(mList.get(position).getCallType());
        }

    }


    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public int getItemViewType(int position) {

        int type;

        if (!TextUtils.isEmpty(mList.get(position).getName())) {
            type = USER_TYPE;

        } else {
            type = HEADER_TYPE;
        }
        return type;
    }

}
