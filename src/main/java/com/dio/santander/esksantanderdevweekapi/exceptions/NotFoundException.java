package com.dio.santander.esksantanderdevweekapi.exceptions;

import com.dio.santander.esksantanderdevweekapi.utils.MessageUtils;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
