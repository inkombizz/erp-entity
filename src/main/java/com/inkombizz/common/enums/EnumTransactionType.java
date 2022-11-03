package com.inkombizz.common.enums;

public class EnumTransactionType {

    public enum ENUM_TransactionType {
        BOM,
        GRP,
        ITMPKG,
        IPSTP,
        PENINGBALANCE,
        SDI,
        SLSTRG,
        SLSTRG_ADJ,
        SOA,
        GRN,
        SOD,
        SRT,
        SPLS,
        INV,
        PRT,
        PRQ,
        POD,
        SRT_MKT_RCV,
        UN_ASG_DLN,
        TOR,
        TOA,
        TOOP,
        ALC_ADJ,
        OAAAM,
        OAASPV,
        OAASLS,
        OAADLR,
        OAA_ADD_AM,
        OAA_ADD_SPV,
        OAA_ADD_SLS,
        OAA_ADD_DLR,
        PSO,
        ADJIN,
        ADJOUT,
        WHTOUT,
        WHTIN,
        DLN,
        DLN_TTP_RLZ,
        IRO,
        BRV,
        BP,
        PLTDRAFTSOD,
        PLT_SOD,
        PYM_RQ,
        PLT_TTP_DRAFT,
        PLT_TTP_RZL,
        SRT_SO_LGT,
        RCK_MTS,
        VCN,
        VDN,
        VDP,
        WPL_TRF,
        WTR,
        WHT,
        OPN,
        OPN_PST
    }

    
    public static String toString(ENUM_TransactionType transactionType) {
        String rValue = "";

        if (transactionType == ENUM_TransactionType.SLSTRG) {
            rValue = "SLS-TRG";
        }else if (transactionType == ENUM_TransactionType.SLSTRG_ADJ) {
            rValue = "SLS-TRG-ADJ";
        }else if (transactionType == ENUM_TransactionType.OAAAM) {
            rValue = "OAA-AM";
        }else if (transactionType == ENUM_TransactionType.ALC_ADJ) {
            rValue = "ALC-ADJ";
        }else if (transactionType == ENUM_TransactionType.OAASPV) {
            rValue = "OAA-SPV";
        }else if (transactionType == ENUM_TransactionType.OAASLS) {
            rValue = "OAA-SLS";
        }else if (transactionType == ENUM_TransactionType.OAADLR) {
            rValue = "OAA-DLR";
        }else if (transactionType == ENUM_TransactionType.OAA_ADD_AM) {
            rValue = "OAA-ADD-AM";
        }else if (transactionType == ENUM_TransactionType.OAA_ADD_SPV) {
            rValue = "OAA-ADD-SPV";
        }else if (transactionType == ENUM_TransactionType.OAA_ADD_SLS) {
            rValue = "OAA-ADD-SLS";
        }else if (transactionType == ENUM_TransactionType.OAA_ADD_DLR) {
            rValue = "OAA-ADD-DLR";
        }else if (transactionType == ENUM_TransactionType.ADJIN) {
            rValue = "ADJ-IN";
        }else if (transactionType == ENUM_TransactionType.ADJOUT) {
            rValue = "ADJ-OUT";
        }else if (transactionType == ENUM_TransactionType.WHTOUT) {
            rValue = "WHT-OUT";
        }else if (transactionType == ENUM_TransactionType.WHTIN) {
            rValue = "WHT-IN";
        }else if (transactionType == ENUM_TransactionType.DLN) {
            rValue = "DLN";
        }else if (transactionType == ENUM_TransactionType.IRO) {
            rValue = "IRO";
        }else if (transactionType == ENUM_TransactionType.PLTDRAFTSOD) {
            rValue = "PLT-DRAFT-SOD";
        }else if (transactionType == ENUM_TransactionType.PLT_SOD) {
            rValue = "PLT-SO";
        }else if (transactionType == ENUM_TransactionType.PLT_TTP_DRAFT) {
            rValue = "PLT-TTP-DRAFT";
        }else if (transactionType == ENUM_TransactionType.PLT_TTP_RZL) {
            rValue = "PLT-TTP-RZL";
        }else if (transactionType == ENUM_TransactionType.DLN_TTP_RLZ) {
            rValue = "DLN-TTP-RLZ";
        }else if (transactionType == ENUM_TransactionType.PYM_RQ) {
            rValue = "PYM-RQ";
        }else if (transactionType == ENUM_TransactionType.PSO) {
            rValue = "PSO";
        }else if (transactionType == ENUM_TransactionType.RCK_MTS) {
            rValue = "RCK-MTS";
        }else if (transactionType == ENUM_TransactionType.WPL_TRF) {
            rValue = "WPL-TRF";
        }else if (transactionType == ENUM_TransactionType.WTR) {
            rValue = "WTR";
        }else if (transactionType == ENUM_TransactionType.OPN_PST) {
            rValue = "OPN-PST";
        }else if (transactionType == ENUM_TransactionType.SRT_MKT_RCV) {
            rValue = "SRT-MKT-RCV";
        }else if (transactionType == ENUM_TransactionType.UN_ASG_DLN) {
            rValue = "UN-ASG-DLN";
        }else if (transactionType == ENUM_TransactionType.SRT_SO_LGT) {
            rValue = "SRT-SO-LGT";
        }

        return rValue;
    }
}
