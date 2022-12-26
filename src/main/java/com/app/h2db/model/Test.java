package com.app.h2db.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.util.Objects;

public class Test {
    private int accountIdentifier;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return accountIdentifier == test.accountIdentifier && Objects.equals(pwAccountId, test.pwAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountIdentifier, pwAccountId);
    }

    private String pwAccountId;
}
