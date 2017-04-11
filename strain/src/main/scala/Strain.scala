object Strain {
  def keep[T](list: Seq[T], f: T => Boolean): List[T] = {
    def keepHelper(index: Int): List[T] = {
      if (index >= list.length) Nil
      else if (f(list(index))) list(index) :: keepHelper(index + 1)
      else keepHelper(index + 1)
    }

    keepHelper(0)
  }

  def discard[T](list: Seq[T], f: T => Boolean): List[T] = {
    def discardHelper(index: Int): List[T] = {
      if (index >= list.length) Nil
      else if (!f(list(index))) list(index) :: discardHelper(index + 1)
      else discardHelper(index + 1)
    }

    discardHelper(0)
  }
}