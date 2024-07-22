### 2. Version Comparator
####Write a set of tests to check whether "Version" is  implemented correctly.

#### Task description

A Version class is defined as follows: class Version implements Comparable<Version> {
Version(String version) { // ... } boolean isSnapshot(); }
This class follows semantic versioning rules which express a version in the format X.Y.Z,
where:
X stands for major;
Y stands for minor;
Z stands for patch.

#### Your goal is to write a set of tests to check whether Version  is implemented correctly.

#### Here are the rules:

• The version constructor argument must not be null. If it is, an
IllegalArgumentException should be thrown with the message:"'version' must not be null!".
• The version constructor argument must match the following regular expression:
\d+(\.\d+){0,2}(-SNAPSHOT)?. If it doesn't, anIllegalArgumentException should be thrown
with the message: "'version' must match: 'major.minor.patch(-SNAPSHOT)'!".
• The following version formats are acceptable: X, X.Y or X.Y.Z - each with or without -
SNAPSHOT suffix. In X case, 0 is used for Y and Zvalues. In X.Y case 0 is used for Z value.
• If the version constructor argument is correct, no exceptions should be thrown.
• Version should correctly recognize whether or not it's defined as a snapshot by calling
isSnapshot() method. It is when the versionconstructor argument ends with -SNAPSHOT;
note that this is case-sensitive.
• Version comparison should be implemented correctly:If a null argument is passed to
the compareTo method, an IllegalArgumentException should be thrown with the
message:"'other' must not be null!".
• The snapshot version must always be lower than any non-snapshot version eg. 1.0.0-
SNAPSHOT < 1.0.0.
• For two given versions, in terms of Integer comparisons, the one containing this.x >
other.x is bigger; or, if equal, this.y >other.y; or, if equal, this.z > other.z. If x, y, z are all equal
for two given versions, both versions are considered equal.


#### IMPORTANT
Note that -SNAPSHOT has to be uppercase
For running test cases use Java 8 and JUnit v4.12
assertj-core v3.11.1 is present in the classpath
hamcrest-core v1.3 is present in the classpath