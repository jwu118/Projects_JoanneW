# Handwriting Recognition using Machine Learning

The provided Python script uses scikit-learn to train a Random Forest classifier on the handwritten digits dataset. It uses the dataset "Digit" and its label from the link: https://app.box.com/s/sogk96kukv6ayyyy6ym63a2nu3aozif7. 

The goal is to build a Machine Learning Algorithm that can recognize the hand-written digits from the dataset. The overall purpose of the code is to load a handwritten digits dataset, train a Random Forest classifier, evaluate its accuracy, and visualize misclassified images.

Technical Details:
~ Requires imports from necessary libraries, `matplotlib` for plotting and `sklearn` for machine learning.
~ Splits the Digit dataset into training ad testing sets using the `train_test_split()` function with a specified test size and random state.
~ Creates a Random Forest classifier with specified parameters (number of estimators, bootstrap, random state).
~ uses `matplotlib` library to display the misclassified images along with their predicted labels.

