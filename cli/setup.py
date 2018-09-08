import setuptools

with open("README.md", "r") as fh:
  long_description = fh.read()

setuptools.setup(
  name = "saveandlearn",
  version = "0.0.1",
  author = "Damien Le Dantec",
  author_email = "damien-le-dantec@hotmail.fr",
  description = "CLI tool for saveandlearn project",
  long_description = long_description,
  long_description_content_type = "text/markdown",
  url = "https://github.com/damienld22/save-and-learn",
  packages = setuptools.find_packages(),
  install_requires = [
    'Click'
  ],
  entry_points = '''
    [console_scripts]
    saveandlearn=saveandlearn.main:cli
  ''',
  classifiers = [
    "Programming Language :: Python :: 3",
    "License :: OSI Approved :: MIT License",
    "Operating System :: OS Independent"
  ]
)