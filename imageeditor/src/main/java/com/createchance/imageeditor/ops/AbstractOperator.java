package com.createchance.imageeditor.ops;

/**
 * ${DESC}
 *
 * @author gaochao1-iri
 * @date 2018/10/28
 */
public abstract class AbstractOperator {

    public static final int OP_BASE_IMAGE = 0;
    public static final int OP_FILTER = 1;
    public static final int OP_TEXT = 2;

    protected final String mName;

    protected final int mType;

    public AbstractOperator(String name, int type) {
        mName = name;
        mType = type;
    }

    public String getName() {
        return mName;
    }

    public int getType() {
        return mType;
    }

    public abstract boolean checkRational();

    public abstract void exec();

    @Override
    public String toString() {
        return "AbstractOperator{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
