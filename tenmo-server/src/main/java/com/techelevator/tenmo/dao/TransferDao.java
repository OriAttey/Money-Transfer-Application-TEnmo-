package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer;

import java.util.List;

public interface TransferDao {


    List<Transfer> getAllTransfersByAccountId(int id);

    Transfer createTransfer(Transfer transfer);

    void updateTransferStatusId( Transfer transferStatusId);


}