import click

def displayBestPractices(listOfBestPractices):
  """Display the list of best practices in the console"""
  numberOfBp = 1
  # Iterate of each best practices and display only those have a title
  for elt in listOfBestPractices:
    if elt['title']:
      click.echo('%s) - %s' % (numberOfBp, elt['title']), nl=True)
      click.echo(elt['content'], nl=True)
      click.echo('', nl=True)
      numberOfBp += 1