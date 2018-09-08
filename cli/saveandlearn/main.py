import click
import list_from_server
import display
import best_practices

# Top level group
@click.group()
def cli():
  """This script is used for the saveandlearn project"""
  pass

@cli.command()
@click.argument('title')
@click.option('--content', '-c', default=None, help="Content of the best practice")
def bp(title, content):
  """Save a best practice"""
  bp = best_practices.BestPractice(title, content)
  try:
    bp.save()
  except:
    click.echo("Error to save best practice") 

@cli.command()
@click.option('-bp', is_flag=True, default=False, help="List all best practices")
def list(bp):
  """List saved informations"""
  if (bp):
    display.displayBestPractices(list_from_server.listBestPractices())

if __name__ == '__main__':
  cli()