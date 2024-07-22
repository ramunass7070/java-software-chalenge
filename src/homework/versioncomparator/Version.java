package homework.versioncomparator;

class Version implements Comparable<homework.versioncomparator.Version> {

    /*
    This class follows semantic versioning rules which express a version in the format X.Y.Z, where:
    X stands for major;
    Y stands for minor;
    Z stands for patch.
    */
    Version(String version) {
    }

    boolean isSnapshot() {
        return false;
    }

    @Override
    public int compareTo(homework.versioncomparator.Version version) {
        return 0;
    }
}
